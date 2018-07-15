public class Composition {
    public static void main(String[] args) {
        Window window = new Window();
        
        System.out.println(window);
        
        System.out.println(window.getScrollbar());
        System.out.println(window.getTitlebar());
        System.out.println(window.getMenu());
        
        window = null;
        
        System.out.println(window);
        
        //you will get null pointer exceptions because those objects already distroied.
        System.out.println(window.getScrollbar());
        System.out.println(window.getTitlebar());
        System.out.println(window.getMenu());
    }
}

class ScrollBar{
    public String toString(){
        return "Scrollbar Available!";
    }
}

class Titlebar{
    public String toString(){
        return "Titlebar available";
    }
}
class Menu{
    public String toString(){
        return "Menu available";
    }
}

class Window{
    
    ScrollBar scrolbar;
    Titlebar titlebar;
    Menu menu;

    public Window() {
        this.scrolbar = new ScrollBar();
        this.titlebar = new Titlebar();
        this.menu = new Menu();
    }
    
    public String toString(){
        return "Window available with "+scrolbar+titlebar+menu;
    }
    
    ScrollBar getScrollbar(){
        return scrolbar;
    }
    
    Titlebar getTitlebar(){
        return titlebar;
    }
    
    Menu getMenu(){
        return menu;
    }
    
}
