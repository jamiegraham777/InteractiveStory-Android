package jamiegraham777.com.interactivestory.model;
import jamiegraham777.com.interactivestory.R;

/**
 * Created by jamiegraham777 on 9/15/16
 */
public class Story {
    private Page[] mPages;

    public Story() {
        mPages = new Page[14];

        mPages[0] = new Page(
                //Step 1- introduction
                R.drawable.portland,
                "Hello %1$s! My name is Alex! I am working on the 24Notion Team to provide creative marketing tactis to upcoming businesses! It’s my job to make our client’s product known to the world. I am excited to start working with you! I’m working with a brand new start-up trying to market from the ground up. Will you help me?",
                new Choice("Absolutely!", 1),
                new Choice("But… I don’t know anything about starting a company?", 2));

        //    new Choice("Start-up Company", 1);
              //  new Choice("Freelance", 4));

//        mPages[1] = new Page(
//                R.drawable.portland,
//                "I’m working with a brand new start-up trying to market from the ground up. Will you help me?",
//                new Choice("Absolutely!", 2),
//                new Choice("But… I don’t know anything about starting a company?", 3));

        mPages[1] = new Page(
                R.drawable.portland,
                "Awesome! Let’s get started. Our client is a software engineer Jessie here in Portland, Oregon. She created a mobile application to connect tourists and local businesses abroad. They asked is to promote:\n" +
                        "\uF0A7\tOnline presence\n" +
                        "\uF0A7\tScaling company transition tactics\n" +
                        "\uF0A7\tEvent/conference engagement\n" +
                "Ready to get started?",
                new Choice("Yes!", 2),
                new Choice("You'll walk me through it right?", 2));
     //   new Choice("Can I switch clients?", 6));

        mPages[3] = new Page(
                //Coming soon
                R.drawable.portland,
                "Remember that you need to catch creativity stars in order progress creative thinking in the game! There is creativity all around you. Click on the catch creativity button to catch creativity!\n" +
                        "Tip: Find a really cool spark of creativity? Screenshot photos of creativity you find to post on social media with that hashtag #24NotionCreativity to win give away prizes by 24Notion!\n",
                new Choice("Got it!", 5),
                new Choice("Can I catch creativity right now?", 6));

        mPages[2] = new Page(
                R.drawable.portland,
                "First, let’s improve the company’s online presence. This includes their website, search engine optimization, and social media. Which one do you want to work on?",
                    new Choice("Website design!", 4),
                  new Choice("Social Media!", 5));
              //    new Choice("Website design! (Requires 10 creativity points)", 5),
              //  new Choice("Social Media! (15 creativity points)", 6));

        mPages[4] = new Page(
                R.drawable.portland,
                "Awesome! There are a lot of factors that go into website design besides just the programming. It’s important to consider navigation, functionally, and engagement when designing the layout. What kind of style do you think would look best on the website?",
                new Choice("Simple, modern, chic", 5),
                new Choice("Bright, vibrant, informative", 7));

      mPages[5] = new Page(
              R.drawable.tv,
              "Fantastic, here is an example of a web layout we could use: the 24Notion.tv website. We can pick out elements of the style and send them to the software development team to create a website based on our design!",
              new Choice("24Notion.net instead of .tv", 7),
                new Choice("Great! What’s next?", 6));
        mPages[6] = new Page(
                R.drawable.po,
                "An important part of marketing is conducting a strong presence online to expand your community of clients! Social media is an effective way to help connect to your users to important information about your company. Which social media do you want to use?",
                new Choice("Facebook", 8),
                new Choice("Twitter", 9));
        mPages[7] = new Page(
                R.drawable.net,
                "Fantastic, here is an example of a web layout we could use: the 24Notion.net website. We can pick out elements of the style and send them to the software development team to create a website based on our design!",
                new Choice("24Notion.tv instead of .net", 5),
                new Choice("Great! What’s next?", 6));
        mPages[8] = new Page(
                R.drawable.po,
                "Facebook is easily designed for business usage. Using Ads and analytics can help you track your client base to better understand your audience and find your demographics. Facebook is a great location to host promotional events and advertise new product features.",
                new Choice("What about Twitter?", 9),
                new Choice("Great! What’s next?", 6));
        mPages[9] = new Page(
                R.drawable.po,
                "Twitter is a great method for reaching out to a large number of people and promoting your name. An effective method for expanding your twitter community is through following your clients and tracking which clients are most interested in your product in order to get a feel for your product.",
                new Choice("What about Facebook?", 8),
                new Choice("Great! What’s next?", 10));
        mPages[10] = new Page(
                R.drawable.podt,
                "Jesse’s company is coming along really well and is making a lot of progress! She obtained a lot of new clients this term. Using both social media and good web tactics can be strong promotional tactics for new start-ups. Next, we want to focus on scaling company transition tactics. It’s important to have a solid growth strategy for when moving forward with the company. Three important methods can help this process:\n" +
                        "•\tBegin functionalizing roles\n" +
                        "•\tTake care of your employees\n" +
                        "•\tFind effective managers to guide your team.\n" +
                        "At 24 Notion, we can guide a start-up company and coach the employees to succeed while expanding. Where do you want to start?\n",
                new Choice("How does the functionalizing role model look?", 12),
                new Choice("How do we take care of employees?", 11));
        mPages[11] = new Page(
                R.drawable.podt,
                "During a start-up, there tends to be a small team who takes on multiple responsibilities. But, as the company grows, it is important to specialize the employees’ tasks by divvying up responsibilities. Creating an effective role model which specific roles can help the company work together as a team. It is really important for a company to maintain good health and well-being of your employees. It is important to keep morale high- encourage vital employees to stay with the company and appreciate their hardwork while bringing in new team members.",
                new Choice("Where do managers fit into this model?", 12),
                new Choice("Interesting. What's next?", 13));
        mPages[12] = new Page(
                R.drawable.podt,
                "As the company grows, the employee base will grow and managers will become a crucial part of company development. It’s important to find good managers who empower their employees in multiple fields areas and can connect employees to another. Having a person higher up in management is important to make sure employment is working like an effective system and all employee have interesting challenges.",
                new Choice("How does one take care of the employees?", 11),
                new Choice("Great! What’s next?",   13));
//        mPages[13] = new Page(
//                R.drawable.portland,
//                "It is really important for a company to maintain good health and well-being of your employees. It is important to keep morale high- encourage vital employees to stay with the company and appreciate their hardwork while bringing in new team members.",
//                new Choice("What about Twitter?", 5),
//                new Choice("Great! What’s next?", 6));
        mPages[13] = new Page(
                R.drawable.build,
                "Great! Jesse's company has gained so many new clients since we started marketing for them. There are several new methods to try to improve a company's outreach to potential consumers. Check out 24notion.tv and 24notion.net to find out more information on how to improve one's business.");
     // Freelance story
//        mPages[9] = new Page(
//                R.drawable.portland,
//                "X.",
//                new Choice("What about Twitter?", 5),
//                new Choice("Great! What’s next?", 6));
    }

    public Page getPage(int pageNumber) {
        return mPages[pageNumber];
    }
}