package spring;

public class MyXmlPathSpringContext extends MySpringContext {
    private String xmlPath;

    public MyXmlPathSpringContext(String xmlPath){
        this.xmlPath = xmlPath;
        this.initBeans();
    }

    @Override
    protected void initBeans() {
        try {
            super.initBeans();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
