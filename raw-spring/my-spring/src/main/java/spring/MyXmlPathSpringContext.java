package spring;

public class MyXmlPathSpringContext extends MySpringContext {
    private String xmlPath;

    public MyXmlPathSpringContext(String xmlPath){
        this.xmlPath = xmlPath;
        this.initBeans();
    }

    @Override
    protected void initBeans() {
        super.initBeans();
    }
}
