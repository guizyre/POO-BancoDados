package academy.guih.poo.javacore.classes.polimorfismo.dominio;

abstract class Dispositivo {
    final String nome;
    String tipo = "Dispositivo";
    private int segredo = 99;
    protected String status = "desligado";

    Dispositivo(String n) {nome = n;System.out.print("D ");}
    void ligar(){System.out.print("LG ");}
    final void resetar(){System.out.print("RS ");}
    static void info(){System.out.println("DI ");}
    protected void diagnosticar(){System.out.print("DG ");}
    String categoria(){return "Generico";}
    abstract void executar();
    public String toString(){
        return "Disp: " + nome;
    }
}

class Notebook extends Dispositivo{
    String classe = "notebook";
    Notebook(){super("note"); System.out.print("N ");}
    void executar(){System.out.print("EX-N ");}
    String categoria(){return "portatil";}
    static void info(){System.out.print("NI ");}
    void executar(Dispositivo alvo){System.out.print("EX-ALVO");}
}

class Servidor extends Dispositivo{
    Servidor(){super("Server"); System.out.print("S ");}
    void executar(){System.out.print("EX-S ");}
    void backup(){System.out.print("BK ");}
}

abstract class Sensor extends Dispositivo{
    Sensor(){super("Sensor"); System.out.print("SE ");}
}

class Termometro extends Sensor{
    Termometro(){System.out.print("T ");}
    void executar(){System.out.print("EX-T ");}
}

abstract class Periferico extends Dispositivo{
    Periferico(String n){super(n); System.out.print("P ");}
}

abstract class Virtual extends Dispositivo{
    Virtual(){super("Virtual"); System.out.print("V ");}
}

class Firewall extends Periferico{
    Firewall(){super("Firewall"); System.out.print("F ");}
    void executar(){System.out.print("EX-F ");}

    @Override
    public String toString() {
        return "Firewall!";
    }
}

class testMain01{
    public static void main(String[] args) {
        Dispositivo d = new Firewall();
        d.executar();
    }
}

