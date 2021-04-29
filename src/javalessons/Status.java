package javalessons;

public class Status {

    public boolean verified;
    public int sentCount;
    public String feedback;

    public Status(boolean verified, int sentCount, String feedback) {
        this.verified = verified;
        this.sentCount = sentCount;
        this.feedback = feedback;
    }

    public Status() {
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public int getSentCount() {
        return sentCount;
    }

    public void setSentCount(int sentCount) {
        this.sentCount = sentCount;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        return "Status{" +
                "verified=" + verified +
                ", sentCount=" + sentCount +
                ", feedback='" + feedback + '\'' +
                '}';
    }
}
