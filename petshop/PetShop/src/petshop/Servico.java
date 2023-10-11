package petshop;

public abstract class Servico {
    public abstract String descricao();

    public abstract double preco();
}

public class Banho extends Servico {
    @Override
    public String descricao() {
        return "Banho";
    }

    @Override
    public double preco() {
        return 30.0;
    }
}

public class Tosa extends Servico {
    @Override
    public String descricao() {
        return "Tosa";
    }

    @Override
    public double preco() {
        return 40.0;
    }
}

public class ConsultaVeterinaria extends Servico {
    @Override
    public String descricao() {
        return "Consulta Veterinária";
    }

    @Override
    public double preco() {
        return 60.0;
    }
}

