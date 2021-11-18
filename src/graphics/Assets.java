package graphics;

import java.awt.image.BufferedImage;

public class Assets {
	
	public static BufferedImage BOARD;
	public static BufferedImage BLACK_ROOK, WHITE_ROOK, BLACK_BISHOP, WHITE_BISHOP, WHITE_KING, 
				    WHITE_QUEEN, BLACK_KING, BLACK_QUEEN, BLACK_KNIGHT,
				    WHITE_KNIGHT,WHITE_PAWN, BLACK_PAWN;
	
	public static void init() {
	
		BOARD = ImageLoader.loadImage("/img/Board.jpg");
		BLACK_ROOK = ImageLoader.loadImage("/img/blackRook.png");
		WHITE_ROOK = ImageLoader.loadImage("/img/whiteRook.png");
		BLACK_BISHOP = ImageLoader.loadImage("/img/blackBishop.png");
		WHITE_BISHOP = ImageLoader.loadImage("/img/whiteBishop.png");
		WHITE_KING = ImageLoader.loadImage("/img/whiteKing.png");
		WHITE_QUEEN = ImageLoader.loadImage("/img/whiteQueen.png");
		BLACK_KING = ImageLoader.loadImage("/img/blackKing.png");
		BLACK_QUEEN = ImageLoader.loadImage("/img/blackQueen.png");
		BLACK_KNIGHT = ImageLoader.loadImage("/img/blackKnight.png");
		WHITE_KNIGHT = ImageLoader.loadImage("/img/whiteKnight.png");
		WHITE_PAWN = ImageLoader.loadImage("/img/whitePawn.png");
		BLACK_PAWN = ImageLoader.loadImage("/img/blackPawn.png");
		
		BOARD = SpriteSheet.cropImage(BOARD, 0, 0, 1000, 1000);
	}
	
	

}
