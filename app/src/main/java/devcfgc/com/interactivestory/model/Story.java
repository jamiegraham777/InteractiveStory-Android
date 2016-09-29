package devcfgc.com.interactivestory.model;

import devcfgc.com.interactivestory.R;

/**
 * Created by jamiegraham777 on 9/15/16
 */
public class Story {
    private Page[] mPages;

    public Story() {
        mPages = new Page[7];

        mPages[0] = new Page(
                R.mipmap.page0,
                "Hello! My name is Alex! I am working on the 24Notion Team to provide creative marketing tactis to upcoming businesses! It’s my job to make our client’s product known to the world. I am excited to start working with you! What client are you interested in helping most?\"",
                new Choice("Start-up Company", 1),
                new Choice("Freelance", 8));

        mPages[1] = new Page(
                R.mipmap.page1,
                "I’m working with a brand new start-up trying to market from the ground up. Will you help me?",
                new Choice("Absolutely!", 2),
                new Choice("But… I don’t know anything about starting a company?", 3));

        mPages[2] = new Page(
                R.mipmap.page2,
                "Awesome! Let’s get started. Our client is a software engineer Jessie here in Portland, Oregon. She created a mobile application to connect tourists and local businesses abroad. They asked is to promote:\n" +
                        "\uF0A7\tOnline presence\n" +
                        "\uF0A7\tScaling company transition tactics\n" +
                        "\uF0A7\tEvent/conference engagement\n" +
                "Ready to get started?",
                new Choice("Yes!", 4),
                new Choice("Can I switch clients?", 6));

        mPages[3] = new Page(
                R.mipmap.page3,
                "Don’t worry! Now is the time to learn! Let’s get started. Our client is a software engineer Jessie here in Portland, Oregon. She created a mobile application to connect tourists and local businesses abroad. They asked is to promote:\n" +
                        "\" +\n" +
                        "                        \"\\uF0A7\\tOnline presence\\n\" +\n" +
                        "                        \"\\uF0A7\\tScaling company transition tactics\\n\" +\n" +
                        "                        \"\\uF0A7\\tEvent/conference engagement\\n\" +\n" +
                        "                \"Ready to get started?\",",
                new Choice("Yes!", 4),
                new Choice("Can I switch clients?", 6));

        mPages[4] = new Page(
                R.mipmap.page4,
                "Remember that you need to catch creativity stars in order progress creative thinking in the game! There is creativity all around you. Click on the catch creativity button to catch creativity!\n" +
                        "Tip: Find a really cool spark of creativity? Screenshot photos of creativity you find to post on social media with that hashtag #24NotionCreativity to win give away prizes by 24Notion!\n",
                new Choice("Got it!", 5),
                new Choice("Can I catch creativity right now?", 6));

        mPages[5] = new Page(
                R.mipmap.page5,
                "4)First, let’s improve the company’s online presence. This includes their website, search engine optimization, and social media. Which one do you want to work on?",
                  new Choice("Website design! (Requires 10 creativity points)", 5),
                new Choice("Social Media! (15 creativity points)", 6));

        mPages[6] = new Page(
                R.mipmap.page6,
                "You arrive home on Earth. While your mission was a success, you forever wonder what was sending that signal. Perhaps a future mission will be able to investigate...");
    }

    public Page getPage(int pageNumber) {
        return mPages[pageNumber];
    }
}