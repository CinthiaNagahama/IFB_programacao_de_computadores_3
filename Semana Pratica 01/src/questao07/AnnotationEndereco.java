package questao07;

public @interface AnnotationEndereco {
	String logradouro();
	String numero() default "S/N";
	String bairro();
	String cidade();
	String estado();
}
