public class Funcionario extends Pessoa{
  private String cargo;
  private double salario;
  private String turno;

  public String getCargo(){
    return cargo;
  }
  public void setCargo(String cargo){
    this.cargo = cargo;
  }

  public double getSalario(){
    return salario;
  }
  public void setSalario(double salario){
    this.salario = salario;
  }

  public String getTurno(){
    return turno;
  }
  public void setTurno(String turno){
    this.turno = turno;
  }

  public Funcionario(String nome, String endereco, String telefone, String cargo, double salario, String turno){
    super(nome, endereco, telefone);
    this.cargo = cargo;
    this.salario = salario;
    this.turno = turno;
  }

  public boolean equals(Object obj){
    if(obj instanceof Funcionario){
      Funcionario f = (Funcionario) obj;
      if(getCargo().equals(f.getCargo()))
        return true;
    }
    return false;
  }
}
