package com.gabb.sb.pluralsightdesignpatterns.builder;

public class BuilderDemo {

    public static void main(String[] args) {
        String tags = "@DeveloperTests";
        String ignoredTags = "@Skip, @Mantis";
        String buildName = "frontrunner-12345-full.zip";
        var tp = new TestPlan.Builder(tags, ignoredTags, buildName)
                .setBranch("origin/master")
                .setBuildVersion("3.4.0")
                .setBuildNumber(55)
                .build();

        System.out.println(tp);

    }
}
