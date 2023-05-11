
public class ReadyState extends State {

	public ReadyState(Player player) {
		super(player);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String clickPlay() {
		player.changeState(new PlayingState(player));
		// player.SetCurrrentState();
		return player.start();
		// return "Pause" ;
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
