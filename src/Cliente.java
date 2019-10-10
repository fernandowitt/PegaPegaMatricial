import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Cliente implements KeyListener{
	int matriz[][] = new int[4][4];
	int x, y;
	int time = 0;
	
	public Cliente(){
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matriz[i][j]=0;
			}
		}
		x = 0;
		y = 0;
		matriz[0][0]=1;
	}
	
	public void printarTabuleiro() {
		for(int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j ++) {
				if(matriz[i][j]==0)
					System.out.printf(" □ ");
				else
					System.out.printf(" ■ ");
			}
			System.out.printf("%n");
		}
	}
	
	public void atualizarPonteiro(int x, int y) {
		matriz[x][y]=0;
		this.x=x;
		this.y=y;
		matriz[x][y]=1;
		time++;
	}
	
	public void keyPressed(KeyEvent e) {
		//Seta P/ baixo
        if (e.getKeyCode()==40){
        	if(x<3) {
        		x++;
        	}else {
        		//mudar a cor da interface gráfica por um milésimo pra dar a sensação de vibração ou batida?
        	}
        }
        //Seta P/ cima        
        if (e.getKeyCode()==38){
        	if(x>0) {
        		x--;
        	}else {
        		//mudar a cor da interface gráfica por um milésimo pra dar a sensação de vibração ou batida?
        	}
        }
        //Seta P/ direita
        if (e.getKeyCode()==39){
        	if(y<3) {
        		y++;
        	}else {
        		//mudar a cor da interface gráfica por um milésimo pra dar a sensação de vibração ou batida?
        	}
        }
        //Seta P/ esquerda
        if (e.getKeyCode()==37){
        	if(y>0) {
        		y--;
        	}else {
        		//mudar a cor da interface gráfica por um milésimo pra dar a sensação de vibração ou batida?
        	}
        }
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
