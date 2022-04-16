package paquete1;

class Clase1 {
    private String atributoDefault = "Valor del atributo privado";
    
    private Clase1(){
        System.out.println("Constructor privado");
    }
    
    public Clase1(String argumento){
        this();
        System.out.println("Constructo publico para acceder al privado");
    }
    
    private void metodoDefault(){
        System.out.println("Metodo privado");
    }

    public String getAtributoDefault() {
        return atributoDefault;
    }

    public void setAtributoDefault(String atributoDefault) {
        this.atributoDefault = atributoDefault;
    }
}
