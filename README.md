Question

Ques. Taking up a list of potential scripts for a request to a resource whose sling:resource type is example/sample and the request selectors are "print.a4" and the request extension is "html". What would be the order in which these scripts would be called ?

GET.jsp

sample.jsp

html.jsp

print.jsp

print.html.jsp

print/a4.jsp

print/a4/html.jsp

print/a4.html.jsp

Answer
The order (priority) in which the scripts will be called is:

print/a4.html.js - (selector)selector + extension
print/a4/html.jsp - (selector)node name + extension
print/a4.jsp - (selector)selector
print.html.jsp - selector + extension
print.jsp - selector
html.jsp - extension
sample.jsp - node name
GET.jsp - default GET priority
Reference Priority: selector+extension > selector > extension > node name > GET/POST
Pq9:9Vy/}:E.z[_Z
