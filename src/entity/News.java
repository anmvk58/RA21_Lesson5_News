package entity;

public class News implements INews{
    int id;
    String title;
    String publishDate;
    String author;
    String content;
    int[] rates;
    float averageRate;

    public News(String title, String publishDate, String author, String content, int[] rates) {
        this.id = id;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.rates = rates;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

//    Title, PublishDate, Author,
//    Content và AverageRate của tin tức ra console.
    @Override
    public void Display() {
        System.out.println("****************************");
        System.out.println("Title: " + title);
        System.out.println("PublishDate: " + publishDate);
        System.out.println("Author: " + author);
        System.out.println("Content: " + content);
        System.out.println("AverageRate: " + averageRate + "\n");
    }

    @Override
    public float Caculate() {
        float result = (float) (rates[0] + rates[1] + rates[2])/3;
        this.averageRate = result;
        return result;
    }
}
