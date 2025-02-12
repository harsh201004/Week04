package resumescreeningsystem;

//Abstract Class JobRole
abstract class JobRole {
    private String candidateName;
    private String resumeDetails;

    public JobRole(String candidateName, String resumeDetails) {
        this.candidateName = candidateName;
        this.resumeDetails = resumeDetails;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public String getResumeDetails() {
        return resumeDetails;
    }


}
