package br_com_markes_cm;

import br_com_markes_cm.modelo.Tabuleiro;
import br_com_markes_cm.visao.TabuleiroConsole;

public class Aplicacao {

		public static void main(String[] args) {
			
			Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
			
			new TabuleiroConsole(tabuleiro);
			
		}
}
