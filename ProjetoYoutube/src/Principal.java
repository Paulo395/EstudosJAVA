import models.Usuario;
import models.Video;
import models.Visualizacao;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario[] p = new Usuario[3];
		Video[] v = new Video[3];
		
		p[0] = new Usuario("Paulo",(short) 22,"Masculino","Sereia");
		p[1] = new Usuario("Henrique",(short) 18,"Masculino","Paulo395");
		
		v[0] = new Video("Aulas de POO");
		v[1] = new Video("Aulas de JAVA");
		
		//SUBINDO DE NIVEL
		//for (int i = 0; i<20; i++) p[0].viuMaisUm();
		//System.out.println(p[0].toString());
		
		Visualizacao vi = new Visualizacao(p[0],v[0]);

		//AVALIANDO
		vi.avaliar(10);
		System.out.println(v[0].toString());
		
		vi.avaliar(5.5f);
		System.out.println(v[0].toString());
	}

}
