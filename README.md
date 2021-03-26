# k8s2csv
The SpringBoot Runner uses the K8s Java Client to list all workload resources for the k8s cluster and prints on std out a csv. The csv can be used to visualize the current state of the k8s workloads in draw.io.

The runner uses the current k8s config context to query the k8s api.

The CSV command line outputcan be used in draw.io Copy the CSV data, open draw.io. Goto "Order-->Insert-->Advanced-->CSV" and paste the csv copy to the text area. Click on insert.

Draw.io uses the Kubernetes Icons to display the CSV data. 

## Example output:
```
# K8s diagram
# label: %label%
# style: html=1;dashed=0;whitespace=wrap;fillColor=#2875E2;strokeColor=#ffffff;points=[[0.005,0.63,0],[0.1,0.2,0],[0.9,0.2,0],[0.5,0,0],[0.995,0.63,0],[0.72,0.99,0],[0.5,1,0],[0.28,0.99,0]];shape=mxgraph.kubernetes.icon;prIcon=%prIcon%
# connect: {"from":"refs", "to":"id", "invert":true, "style":"curved=0;endArrow=blockThin;endFill=1;sketch="}
# connect: {"from":"ns", "to":"id", "invert":true, "style":"curved=0;endArrow=blockThin;endFill=1;sketch=1"}
# width: 80
# width: 80
# height: 80
# nodespacing: 40
# levelspacing: 40
# edgespacing: 40
# layout: verticalflow
## CSV data starts below this line
id,refs,label,prIcon,ns
default,,default,ns,
kube-node-lease,,kube-node-lease,ns,
kube-public,,kube-public,ns,
kube-system,,kube-system,ns,
ops,,ops,ns,
cluster-autoscaler-aws-cluster-autoscaler,,cluster-autoscaler-aws-cluster-autoscaler,deploy,kube-system
coredns,,coredns,deploy,kube-system
metrics-server,,metrics-server,deploy,kube-system
sealed-secrets-controller,,sealed-secrets-controller,deploy,kube-system
cert-manager,,cert-manager,deploy,ops
cert-manager-cainjector,,cert-manager-cainjector,deploy,ops
cert-manager-webhook,,cert-manager-webhook,deploy,ops
external-dns,,external-dns,deploy,ops
gitlab-runner,,gitlab-runner,deploy,ops
grafana,,grafana,deploy,ops
ingress-nginx-controller,,ingress-nginx-controller,deploy,ops
jaeger-operator,,jaeger-operator,deploy,ops
postgres-operator,,postgres-operator,deploy,ops
prometheus-adapter,,prometheus-adapter,deploy,ops
prometheus-alertmanager,,prometheus-alertmanager,deploy,ops
prometheus-kube-state-metrics,,prometheus-kube-state-metrics,deploy,ops
prometheus-pushgateway,,prometheus-pushgateway,deploy,ops
prometheus-server,,prometheus-server,deploy,ops
simplest,simplest,simplest,deploy,ops
smtp4dev,,smtp4dev,deploy,ops
metrics-server-76f8d9fc69,metrics-server,metrics-server-76f8d9fc69,rs,
sealed-secrets-controller-7c766b885b,sealed-secrets-controller,sealed-secrets-controller-7c766b885b,rs,
cert-manager-68bc7947d6,cert-manager,cert-manager-68bc7947d6,rs,
cert-manager-cainjector-74459fcc56,cert-manager-cainjector,cert-manager-cainjector-74459fcc56,rs,
cert-manager-webhook-555d9d4879,cert-manager-webhook,cert-manager-webhook-555d9d4879,rs,
external-dns-774bdc4c56,external-dns,external-dns-774bdc4c56,rs,
gitlab-runner-778dd686dd,gitlab-runner,gitlab-runner-778dd686dd,rs,
gitlab-runner-7b68d48bb9,gitlab-runner,gitlab-runner-7b68d48bb9,rs,
grafana-7785fc5c46,grafana,grafana-7785fc5c46,rs,
ingress-nginx-controller-c4f944d4d,ingress-nginx-controller,ingress-nginx-controller-c4f944d4d,rs,
jaeger-operator-cb66b9b46,jaeger-operator,jaeger-operator-cb66b9b46,rs,
postgres-operator-86b8964fbc,postgres-operator,postgres-operator-86b8964fbc,rs,
prometheus-adapter-c95f55f6b,prometheus-adapter,prometheus-adapter-c95f55f6b,rs,
prometheus-alertmanager-58b5b9d6d8,prometheus-alertmanager,prometheus-alertmanager-58b5b9d6d8,rs,
prometheus-kube-state-metrics-95d956569,prometheus-kube-state-metrics,prometheus-kube-state-metrics-95d956569,rs,
prometheus-pushgateway-5d6884b99,prometheus-pushgateway,prometheus-pushgateway-5d6884b99,rs,
prometheus-server-6b687c4b87,prometheus-server,prometheus-server-6b687c4b87,rs,
simplest-9484c9777,simplest,simplest-9484c9777,rs,
smtp4dev-5ff5d9895d,smtp4dev,smtp4dev-5ff5d9895d,rs,
aws-node,,aws-node,ds,kube-system
aws-node-termination-handler,,aws-node-termination-handler,ds,kube-system
kube-proxy,,kube-proxy,ds,kube-system
loki-stack-promtail,,loki-stack-promtail,ds,ops
prometheus-node-exporter,,prometheus-node-exporter,ds,ops
keycloak,,keycloak,sts,ops
keycloak-postgresql,,keycloak-postgresql,sts,ops
loki-stack,,loki-stack,sts,ops
aws-node-k24vf,aws-node,aws-node-k24vf,pod,
aws-node-khh85,aws-node,aws-node-khh85,pod,
aws-node-sbdfj,aws-node,aws-node-sbdfj,pod,
aws-node-termination-handler-vcmbj,aws-node-termination-handler,aws-node-termination-handler-vcmbj,pod,
kube-proxy-27b4s,kube-proxy,kube-proxy-27b4s,pod,
kube-proxy-9t25t,kube-proxy,kube-proxy-9t25t,pod,
kube-proxy-sgzvh,kube-proxy,kube-proxy-sgzvh,pod,
metrics-server-76f8d9fc69-2vpx6,metrics-server-76f8d9fc69,metrics-server-76f8d9fc69-2vpx6,pod,
sealed-secrets-controller-7c766b885b-5brrj,sealed-secrets-controller-7c766b885b,sealed-secrets-controller-7c766b885b-5brrj,pod,
cert-manager-68bc7947d6-tqcxt,cert-manager-68bc7947d6,cert-manager-68bc7947d6-tqcxt,pod,
cert-manager-cainjector-74459fcc56-rsfd2,cert-manager-cainjector-74459fcc56,cert-manager-cainjector-74459fcc56-rsfd2,pod,
cert-manager-webhook-555d9d4879-ghrhr,cert-manager-webhook-555d9d4879,cert-manager-webhook-555d9d4879-ghrhr,pod,
external-dns-774bdc4c56-68wjf,external-dns-774bdc4c56,external-dns-774bdc4c56-68wjf,pod,
gitlab-runner-7b68d48bb9-7fc7m,gitlab-runner-7b68d48bb9,gitlab-runner-7b68d48bb9-7fc7m,pod,
grafana-7785fc5c46-v4c8c,grafana-7785fc5c46,grafana-7785fc5c46-v4c8c,pod,
ingress-nginx-controller-c4f944d4d-lctks,ingress-nginx-controller-c4f944d4d,ingress-nginx-controller-c4f944d4d-lctks,pod,
jaeger-operator-cb66b9b46-fqdns,jaeger-operator-cb66b9b46,jaeger-operator-cb66b9b46-fqdns,pod,
keycloak-0,keycloak,keycloak-0,pod,
keycloak-postgresql-0,keycloak-postgresql,keycloak-postgresql-0,pod,
loki-stack-0,loki-stack,loki-stack-0,pod,
loki-stack-promtail-9n9ks,loki-stack-promtail,loki-stack-promtail-9n9ks,pod,
loki-stack-promtail-ftkqr,loki-stack-promtail,loki-stack-promtail-ftkqr,pod,
loki-stack-promtail-qdftg,loki-stack-promtail,loki-stack-promtail-qdftg,pod,
postgres-operator-86b8964fbc-99gtt,postgres-operator-86b8964fbc,postgres-operator-86b8964fbc-99gtt,pod,
prometheus-adapter-c95f55f6b-fn4dp,prometheus-adapter-c95f55f6b,prometheus-adapter-c95f55f6b-fn4dp,pod,
prometheus-alertmanager-58b5b9d6d8-pgr22,prometheus-alertmanager-58b5b9d6d8,prometheus-alertmanager-58b5b9d6d8-pgr22,pod,
prometheus-kube-state-metrics-95d956569-2tn4f,prometheus-kube-state-metrics-95d956569,prometheus-kube-state-metrics-95d956569-2tn4f,pod,
prometheus-node-exporter-4tcvj,prometheus-node-exporter,prometheus-node-exporter-4tcvj,pod,
prometheus-node-exporter-jn6hx,prometheus-node-exporter,prometheus-node-exporter-jn6hx,pod,
prometheus-node-exporter-nchzn,prometheus-node-exporter,prometheus-node-exporter-nchzn,pod,
prometheus-pushgateway-5d6884b99-sdptb,prometheus-pushgateway-5d6884b99,prometheus-pushgateway-5d6884b99-sdptb,pod,
prometheus-server-6b687c4b87-wb4vw,prometheus-server-6b687c4b87,prometheus-server-6b687c4b87-wb4vw,pod,
simplest-9484c9777-xfmgl,simplest-9484c9777,simplest-9484c9777-xfmgl,pod,
smtp4dev-5ff5d9895d-n7bll,smtp4dev-5ff5d9895d,smtp4dev-5ff5d9895d-n7bll,pod,
```

## Example screenshot:


