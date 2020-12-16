(window.webpackJsonp=window.webpackJsonp||[]).push([[29],{T4xc:function(e,t,n){"use strict";n.r(t),n.d(t,"_frontmatter",(function(){return c})),n.d(t,"default",(function(){return s}));var o=n("k1TG"),a=n("8o2o"),r=(n("q1tI"),n("7ljp")),l=n("013z"),c=(n("qKvR"),{}),b={_frontmatter:c},i=l.a;function s(e){var t=e.components,n=Object(a.a)(e,["components"]);return Object(r.b)(i,Object(o.a)({},b,n,{components:t,mdxType:"MDXLayout"}),Object(r.b)("p",null,"The IBM FHIR Server - Must-Gather Information"),Object(r.b)("ol",null,Object(r.b)("li",{parentName:"ol"},Object(r.b)("p",{parentName:"li"},"Which environment did the problem occur in?\na. Kubernetes Version (IKS, ROKS)\nb. If not one of the standard environments,\nPlease indicate the Operating System and java version in use\nOS:  Windows/Linux/Mac\nJava: (output of “java -fullversion”)\nc. The IBM FHIR Version\nd. Docker Version")),Object(r.b)("li",{parentName:"ol"},Object(r.b)("p",{parentName:"li"},"Describe the problem as clearly as you can. Be sure to include:\na. Steps to reproduce the problem\nb. The actual REST API URL strings (rather than placeholders copied from a test plan, etc.)\ne.g. https://hostname/fhir-server/api/v4\nOnly provide as appropriate for sharing publically."),Object(r.b)("p",{parentName:"li"},"c. Full stacktraces (include all “caused by” clauses)\nd. The error messages from liberty’s messages.log file that are related to the problem\ne. Contents of any applicable FHIR resources (avoid PHI)"),Object(r.b)("p",{parentName:"li"},"Note: As part of an error response, the IBM FHIR Server typically returns\nan OperationOutcome in the HTTP response, and the error message contains\na “probeId=xxx” value.   You can search for this probeId value within the messages.log\nand/or trace.log to find the matching server-side messages related to the problem.")),Object(r.b)("li",{parentName:"ol"},Object(r.b)("p",{parentName:"li"},"If possible, please include a trace.log (or snippet) which shows the server activity when the problem occurred.\nThe liberty “traceSpecification” string should include ",Object(r.b)("inlineCode",{parentName:"p"},"com.ibm.fhir.*=fine")))),Object(r.b)("h1",null,"Gathering logs on Red Hat OpenShift"),Object(r.b)("p",null,"To help IBM Support troubleshoot any issues with your ",Object(r.b)("em",{parentName:"p"},"IBM FHIR Server instance")," on OpenShift, use the ",Object(r.b)("inlineCode",{parentName:"p"},"oc adm must-gather")," command to capture the must gather logs. The logs are stored in a folder in the current working directory."),Object(r.b)("p",null,"To gather diagnostic logs, run the following commands as Cluster Administrator and replace ",Object(r.b)("inlineCode",{parentName:"p"},"YOUR_NAMESPACE")," with your namespace that the IBM FHIR Server and the IBM FHIR Server Schematool is running."),Object(r.b)("ol",null,Object(r.b)("li",{parentName:"ol"},Object(r.b)("p",{parentName:"li"},"Log in to your Red Hat OpenShift Container Platform as a cluster administrator by using the oc CLI.")),Object(r.b)("li",{parentName:"ol"},Object(r.b)("p",{parentName:"li"},"Provide the output of the OpenShift version."))),Object(r.b)("pre",null,Object(r.b)("code",Object(o.a)({parentName:"pre"},{}),"oc version > version.txt\n")),Object(r.b)("ol",null,Object(r.b)("li",{parentName:"ol"},"Provide the output of the Kubectl version.")),Object(r.b)("pre",null,Object(r.b)("code",Object(o.a)({parentName:"pre"},{}),"kubectl version >> version.txt\n")),Object(r.b)("ol",null,Object(r.b)("li",{parentName:"ol"},"Collection information about the nodes.")),Object(r.b)("pre",null,Object(r.b)("code",Object(o.a)({parentName:"pre"},{}),"oc get nodes -o wide -n YOUR_NAMESPACE > nodes.txt\n")),Object(r.b)("ol",null,Object(r.b)("li",{parentName:"ol"},"Collect information about the pod statuses")),Object(r.b)("pre",null,Object(r.b)("code",Object(o.a)({parentName:"pre"},{}),"oc get pods -n YOUR_NAMESPACE > pods.txt\n")),Object(r.b)("ol",null,Object(r.b)("li",{parentName:"ol"},"Collect information about the pod containers")),Object(r.b)("pre",null,Object(r.b)("code",Object(o.a)({parentName:"pre"},{}),'oc get pods -o jsonpath="{..image}"  -n YOUR_NAMESPACE > containerInfo.txt\n')),Object(r.b)("ol",null,Object(r.b)("li",{parentName:"ol"},"Collect the defined secrets")),Object(r.b)("pre",null,Object(r.b)("code",Object(o.a)({parentName:"pre"},{}),"oc get secrets  -n YOUR_NAMESPACE > secrets.txt\n")),Object(r.b)("ol",null,Object(r.b)("li",{parentName:"ol"},"Collect the defined persistent volume claims")),Object(r.b)("pre",null,Object(r.b)("code",Object(o.a)({parentName:"pre"},{}),"oc get pvc -n YOUR_NAMESPACE > pvcs.txt\n")),Object(r.b)("ol",null,Object(r.b)("li",{parentName:"ol"},"Collect the description and log of any pod you are having issues with:")),Object(r.b)("pre",null,Object(r.b)("code",Object(o.a)({parentName:"pre"},{}),"oc describe pod YOUR_POD_NAME -n YOUR_NAMESPACE > describe-YOUR_POD_NAME.txt\noc logs YOUR_POD_NAME -n YOUR_NAMESPACE > log-YOUR_POD_NAME.log\n")),Object(r.b)("ol",null,Object(r.b)("li",{parentName:"ol"},"The oc adm must-gather CLI command collects the information from your cluster that is most likely needed for debugging issues, such as:")),Object(r.b)("pre",null,Object(r.b)("code",Object(o.a)({parentName:"pre"},{}),"oc adm must-gather\n")),Object(r.b)("ol",null,Object(r.b)("li",{parentName:"ol"},"To obtain your cluster ID using the OpenShift CLI (oc), run the following command:")),Object(r.b)("pre",null,Object(r.b)("code",Object(o.a)({parentName:"pre"},{}),"oc get clusterversion -o jsonpath='{.items[].spec.clusterID}{\"\\n\"}'\n")),Object(r.b)("ol",null,Object(r.b)("li",{parentName:"ol"},"Provide the Custom Resource(CR) .yaml file used by the operator to configure the environment")),Object(r.b)("pre",null,Object(r.b)("code",Object(o.a)({parentName:"pre"},{}),"kubectl get YOUR_CONFIG -o yaml > config.yaml\n")),Object(r.b)("ol",null,Object(r.b)("li",{parentName:"ol"},"Obtain detailed description of a pod")),Object(r.b)("pre",null,Object(r.b)("code",Object(o.a)({parentName:"pre"},{}),"oc describe pod -n YOUR_NAMESPACE POD_NAME &> POD_NAME_describe.log\n")),Object(r.b)("ol",null,Object(r.b)("li",{parentName:"ol"},"Run the oc adm inspect")),Object(r.b)("pre",null,Object(r.b)("code",Object(o.a)({parentName:"pre"},{}),"oc adm inspect\n")),Object(r.b)("p",null,"Executing commands/bash shell inside a pod:"),Object(r.b)("pre",null,Object(r.b)("code",Object(o.a)({parentName:"pre"},{}),"oc exec [flags] -n YOUR_NAMESPACE POD [-c CONTAINER] -- COMMAND [args...]\n")),Object(r.b)("p",null,"Example: to run a bash shell within the pod and tail the liberty messages.log:"),Object(r.b)("pre",null,Object(r.b)("code",Object(o.a)({parentName:"pre"},{}),"     oc exec -ti  ibmfhirserver-as6jql -- /bin/bash \n     bash-4.2$ tail -f /logs/messages.log \n")),Object(r.b)("p",null,"Provide the data to your support team. Note, please review and redact any sensistive data before posting in any issue."))}s.isMDXComponent=!0}}]);
//# sourceMappingURL=component---src-pages-must-gather-md-87aca15e130cf6e7f556.js.map