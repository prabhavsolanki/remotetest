package servlets;



import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.service.component.annotations.Component;


import javax.jcr.Node;
import javax.jcr.RepositoryException;
import javax.servlet.Servlet;
import java.io.IOException;
import java.util.*;

@Component
        (service = Servlet.class,
                property = {
                "sling.servlet.paths=/libs/myweb"
        }

        )
public class ServletByPath extends SlingSafeMethodsServlet {
    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws IOException {
//        response.getWriter().print("this is a nw servlrt....");
        ResourceResolver resourceResolver = request.getResourceResolver();

        Iterable<Resource> child= resourceResolver.getResource("/content/devices").getChildren();

        String title = "";
        String created = "";

        List<Device> childList = new ArrayList<Device>();
        for(Resource resource : child){

            Node node = resource.adaptTo(Node.class);
            try {
                title = node.getName();
                created = node.getProperty("jcr:created").getValue().getString();
            } catch (RepositoryException e) {
                e.printStackTrace();
            }
            childList.add(new Device(title,created));
        }
        response.getWriter().println("Ascending.....");
        Collections.sort(childList, new Comparator<Device>(){
            public int compare(Device o1, Device o2) {
                return  o1.getCreated().compareTo(o2.getCreated());
            }
        });
        response.getWriter().println(childList);

        Collections.sort(childList, new Comparator <Device>(){
            public int compare(Device o1, Device o2) {
                return  -o1.getCreated().compareTo(o2.getCreated());
            }
        });
        response.getWriter().println("Descending..");
        response.getWriter().println(childList);

    }
}
