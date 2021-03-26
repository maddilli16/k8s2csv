package com.mdl.k8s2csv;

import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.apis.AppsV1Api;
import io.kubernetes.client.openapi.models.*;
import io.kubernetes.client.util.Config;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class K8s2csvApplication {

	public static void main(String[] args) throws IOException, ApiException {
		SpringApplication.run(K8s2csvApplication.class, args);
		System.out.println("");
		System.out.println("# K8s diagram");
		System.out.println("# label: %label%");
		System.out.println("# style: html=1;dashed=0;whitespace=wrap;fillColor=#2875E2;strokeColor=#ffffff;points=[[0.005,0.63,0],[0.1,0.2,0],[0.9,0.2,0],[0.5,0,0],[0.995,0.63,0],[0.72,0.99,0],[0.5,1,0],[0.28,0.99,0]];shape=mxgraph.kubernetes.icon;prIcon=%prIcon%");
		System.out.println("# connect: {\"from\":\"refs\", \"to\":\"id\", \"invert\":true, \"style\":\"curved=0;endArrow=blockThin;endFill=1;sketch=\"}");
		System.out.println("# connect: {\"from\":\"ns\", \"to\":\"id\", \"invert\":true, \"style\":\"curved=0;endArrow=blockThin;endFill=1;sketch=1\"}");
		System.out.println("# width: 80");
		System.out.println("# width: 80");
		System.out.println("# height: 80");
		System.out.println("# nodespacing: 40");
		System.out.println("# levelspacing: 40");
		System.out.println("# edgespacing: 40");
		System.out.println("# layout: verticalflow");
		System.out.println("## CSV data starts below this line");
		System.out.println("id,refs,label,prIcon,ns");






		// -------- K8s --------------
		ApiClient client = Config.defaultClient();
		Configuration.setDefaultApiClient(client);

		AppsV1Api v1Api = new AppsV1Api();
		CoreV1Api api = new CoreV1Api();

		// -------- Namespaces --------------
		V1NamespaceList nsList = api.listNamespace(null, null, null, null, null, null, null, null, null);
		String prIcon = "ns";
		for (V1Namespace item : nsList.getItems()) {
			String id = item.getMetadata().getName();
			String label =id;
			String refs = "";
			String ns = "";
			System.out.println(id+","+refs+","+label+","+prIcon+","+ns);
		}

		// -------- Workloads --------------
		// -------- Deployment --------------
		V1DeploymentList deploymentList = v1Api.listDeploymentForAllNamespaces(null, null, null, null, null, null, null, null, null);
		prIcon = "deploy";
		for (V1Deployment item : deploymentList.getItems()) {
			String id = item.getMetadata().getName();
			String label =id;
			String refs = "";
			String ns = item.getMetadata().getNamespace();
			if(item.getMetadata().getOwnerReferences() != null)
			{
				for (V1OwnerReference ref : item.getMetadata().getOwnerReferences())
				{
					refs = ref.getName();
					System.out.println(id+","+refs+","+label+","+prIcon+","+ns);
				}
			} else {
				System.out.println(id+","+refs+","+label+","+prIcon+","+ns);
			}
		}
		// -------- ReplicaSet --------------
		V1ReplicaSetList rsList = v1Api.listReplicaSetForAllNamespaces(null, null, null, null, null, null, null, null, null);
		prIcon = "rs";
		for (V1ReplicaSet item : rsList.getItems()) {
			String id = item.getMetadata().getName();
			String label =id;
			String refs = "";
			String ns = "";
			if(item.getMetadata().getOwnerReferences() != null)
			{
				for (V1OwnerReference ref : item.getMetadata().getOwnerReferences())
				{
					refs = ref.getName();
					System.out.println(id+","+refs+","+label+","+prIcon+","+ns);
				}
			} else {
				System.out.println(id+","+refs+","+label+","+prIcon+","+ns);
			}
		}
		// -------- DeamonSet --------------
		V1DaemonSetList dsList = v1Api.listDaemonSetForAllNamespaces(null, null, null, null, null, null, null, null, null);
		prIcon = "ds";
		for (V1DaemonSet item : dsList.getItems()) {
			String id = item.getMetadata().getName();
			String label =id;
			String refs = "";
			String ns = item.getMetadata().getNamespace();
			if(item.getMetadata().getOwnerReferences() != null)
			{
				for (V1OwnerReference ref : item.getMetadata().getOwnerReferences())
				{
					refs = ref.getName();
					System.out.println(id+","+refs+","+label+","+prIcon+","+ns);
				}
			} else {
				System.out.println(id+","+refs+","+label+","+prIcon+","+ns);
			}
		}
		// -------- StatefulSet --------------
		V1StatefulSetList stsList = v1Api.listStatefulSetForAllNamespaces(null, null, null, null, null, null, null, null, null);
		prIcon = "sts";
		for (V1StatefulSet item : stsList.getItems()) {
			String id = item.getMetadata().getName();
			String label =id;
			String refs = "";
			String ns = item.getMetadata().getNamespace();
			if(item.getMetadata().getOwnerReferences() != null)
			{
				for (V1OwnerReference ref : item.getMetadata().getOwnerReferences())
				{
					refs = ref.getName();
					System.out.println(id+","+refs+","+label+","+prIcon+","+ns);
				}
			} else {
				System.out.println(id+","+refs+","+label+","+prIcon+","+ns);
			}
		}
		// -------- Pods --------------
		V1PodList list = api.listPodForAllNamespaces(null, null, null, null, null, null, null, null, null);
		prIcon = "pod";
		for (V1Pod pod : list.getItems()) {
			String id = pod.getMetadata().getName();
			String label =id;
			String refs = "";
			String ns = "";
			if(pod.getMetadata().getOwnerReferences() != null)
			{
				for (V1OwnerReference ref : pod.getMetadata().getOwnerReferences())
				{
					refs = ref.getName();
					System.out.println(id+","+refs+","+label+","+prIcon+","+ns);
				}
			} else {
				System.out.println(id+","+refs+","+label+","+prIcon+","+ns);
			}
		}
		// -------- Jobs --------------
		// -------- CronJobs --------------

	}



}
