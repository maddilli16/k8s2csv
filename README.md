# k8s2csv
The SpringBoot Runner uses the K8s Java Client to list all workload resources for the k8s cluster and prints on std out a csv. The csv can be used to visualize the current state of the k8s workloads in draw.io.

The runner uses the current k8s config context to query the k8s api.

The CSV command line outputcan be used in draw.io Copy the CSV data, open draw.io. Goto "Order-->Insert-->Advanced-->CSV" and paste the csv copy to the text area. Click on insert.

Draw.io uses the Kubernetes Icons to display the CSV data. 

## Example output:


## Example screenshot:


