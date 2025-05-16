	package clases;
	
	import java.time.LocalDate;
	
	public class Empleado {
		
		final static int NUMERO_MESES_ANYO = 12;
	
		private String nombre;
		private String puesto;
		private double salario;
		private LocalDate inicioContrato;
		
		
		public Empleado() {
			
		}
		
		
		public Empleado(String nombre, String puesto, double salario, String inicioContrato) {
			this.nombre=nombre;
			this.puesto=puesto;
			this.salario=salario;
			this.inicioContrato = LocalDate.parse(inicioContrato);
			
		}
		
		public double salario_anual() {
			double sal_anual = 0;
			
			sal_anual = salario*NUMERO_MESES_ANYO;
			
			return sal_anual;
			
		}
	
		
		
		
		
	
		public LocalDate getInicioContrato() {
			return inicioContrato;
		}
	
	
	
	
	
	
		public void setInicioContrato(LocalDate inicioContrato) {
			this.inicioContrato = inicioContrato;
		}
	
	
	
	
	
	
		public String getNombre() {
			return nombre;
		}
	
	
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
	
	
		public String getPuesto() {
			return puesto;
		}
	
	
		public void setPuesto(String puesto) {
			this.puesto = puesto;
		}
	
	
		public double getSalario() {
			return salario;
		}
	
	
		public void setSalario(double salario) {
			this.salario = salario;
		}
	
	
		@Override
		public String toString() {
			return "Empleado [nombre:" + nombre + ", puesto:" + puesto + ", salario mensual:" + salario + ", inicio de contrato="
					+ inicioContrato + "]";
		}
	
	
	
		
		
		
		
		
	
	}


