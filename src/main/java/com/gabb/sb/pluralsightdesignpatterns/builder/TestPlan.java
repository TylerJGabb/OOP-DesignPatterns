package com.gabb.sb.pluralsightdesignpatterns.builder;

public class TestPlan {

    private final String tags;

    private final String ignoredTags;
    private final String buildName;       //used to find the distribution .zip file on the filesystem
    private final String buildVersion;
    private final String branch;
    private final int buildNumber;

    private TestPlan(Builder builder){
        tags = builder.tags;
        ignoredTags = builder.ignoredTags;
        buildName = builder.buildName;
        buildVersion = builder.buildVersion;
        branch = builder.branch;
        buildNumber = builder.buildNumber;
    }

    public String getTags() {
        return tags;
    }

    public String getIgnoredTags() {
        return ignoredTags;
    }

    public String getBuildName() {
        return buildName;
    }

    public String getBuildVersion() {
        return buildVersion;
    }

    public String getBranch() {
        return branch;
    }

    @Override
    public String toString() {
        return "TestPlan{" +
                "tags='" + tags + '\'' +
                ", ignoredTags='" + ignoredTags + '\'' +
                ", buildName='" + buildName + '\'' +
                ", buildVersion='" + buildVersion + '\'' +
                ", branch='" + branch + '\'' +
                ", buildNumber=" + buildNumber +
                '}';
    }

    public static class Builder {
        public int buildNumber;
        private String tags;
        private String ignoredTags;
        private String buildName;       //used to find the distribution .zip file on the filesystem
        private String buildVersion;
        private String branch;

        public Builder(String tags, String ignoredTags, String buildName) {
            this.tags = tags;
            this.ignoredTags = ignoredTags;
            this.buildName = buildName;
        }

        public Builder setBuildVersion(String buildVersion) {
            this.buildVersion = buildVersion;
            return this;
        }

        public Builder setBranch(String branch) {
            this.branch = branch;
            return this;
        }

        public Builder setBuildNumber(int buildNumber) {
            this.buildNumber = buildNumber;
            return this;
        }

        public TestPlan build(){
            return new TestPlan(this);
        }
    }

}


