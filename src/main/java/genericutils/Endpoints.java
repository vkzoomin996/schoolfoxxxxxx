package genericutils;

public interface Endpoints {
	String createProject="/addProject";
	String upadateProject="/projects/{projectId}";
	String getAllProjects="/projects";
	String getSingleproject="/projects/{projectId}";
	String deleteProject="/projects/{projectId}";

}
