
public class PlayingState extends State {

	public PlayingState(Player player) {
		super(player);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public  String clickPlay() {
		player.changeState(new ReadyState(player));
		//player.SetCurrrentState();
		return player.pause();
		//return "Pause" ;
	}
	@Override
	public String clickNext() {
		return player.next();
	}
	
	@Override
	public String clickLock() {
		player.changeState(new LockedState(player));
		return player.stop();
	}

	@Override
	public String clickPrevious() {
		return player.previous();
	}
	
	
	
}
