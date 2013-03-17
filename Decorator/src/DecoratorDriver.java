
public class DecoratorDriver {
	public static void main(String[] args) {
		VisualComponent vc = new ScrollDecorator(
				new BorderDecorator(
						new TextComponent(), 13), 15);
		vc.draw();
		vc.resize();
	}
}