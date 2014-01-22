import info.gridworld.grid.*;
import info.gridworld.actor.*;

public class PokemonTestRunner {

	public static void main(String[] args)
    {
		final PokemonGrid gr = new PokemonGrid();
		gr.fillWorld2();
		ActorWorld world = new ActorWorld((Grid) gr);
		world.show();

		java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new java.awt.KeyEventDispatcher(){
      public boolean dispatchKeyEvent(java.awt.event.KeyEvent event){
        String key = javax.swing.KeyStroke.getKeyStrokeForEvent(event).toString();
        if (key.equals( "pressed RIGHT")){
          gr.fillWorld2();}
        if (key.equals( "pressed LEFT")){
          gr.fillWorld1();}
        return true;
      }
    }
    );//End of the User Control Code
    }
}
