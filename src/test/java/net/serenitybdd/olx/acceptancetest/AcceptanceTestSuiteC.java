package net.serenitybdd.olx.acceptancetest;

import net.serenitybdd.jbehave.SerenityStories;

import java.util.Arrays;

public class AcceptanceTestSuiteC extends SerenityStories {
    public void OlxTestSuite() {
        configuredEmbedder().embedderControls().doGenerateViewAfterStories(true)
                .doIgnoreFailureInStories(true)
                .doIgnoreFailureInView(true).useThreads(2);

        configuredEmbedder().useMetaFilters(Arrays.asList("-skip"));
    }
}