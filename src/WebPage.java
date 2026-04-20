public class WebPage {
     private String url;
   private  String title;
    private String content;

    //constructor
    WebPage(String url, String title, String content){
        this.url = url;
        this.title = title;
        this.content = content;

    }

    //getters
    public String getUrl(){
        return url;
    }
    public String getTitle(){
        return title;
    }

    public String getContent(){
        return content;
    }

    public static void main(String[] args) {

        WebPage w1 = new WebPage("gfg", "Geeky", "Java tutorials");

        String URL1 = w1.getUrl();
        System.out.println(URL1);

    }


}
