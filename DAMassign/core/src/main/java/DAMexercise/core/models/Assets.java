package DAMexercise.core.models;

import com.adobe.cq.sightly.WCMUsePojo;
import com.day.cq.dam.api.Rendition;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ValueMap;
import com.day.cq.dam.api.Asset;

import java.util.HashMap;


public class Assets extends WCMUsePojo {

    private String image;


    @Override
    public void activate() throws Exception {
        Resource currentResource = getResource();

        ResourceResolver resourceResolver = getResourceResolver();
        ValueMap valueMap = currentResource.getValueMap();
        String path = (String) valueMap.get("assetPath");
        String[] resolution = ((String) valueMap.get("resolution")).split(":");
        Resource resource = resourceResolver.getResource(path);
        Asset assetRes = resource.adaptTo(Asset.class);
        if (assetRes != null) {
            String userResolution = resolution[0] + "." + resolution[1] + ".png";

            image = assetRes.getOriginal().getPath();
            for (Rendition rendition : assetRes.getRenditions()) {
                String renditionPath = rendition.getPath();
                if (renditionPath.endsWith(userResolution)) {
                    image = renditionPath;
                }

            }
        }

    }


    public String getImage() {
        return image;
    }
}
