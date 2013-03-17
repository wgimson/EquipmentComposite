
public class ScrollDecorator extends Decorator {
	
	private int _scrollLength;
	
	public ScrollDecorator(VisualComponent component, int scrollLength) {
		super(component);
		this._scrollLength = scrollLength;
	}
	
	///////////////////////////////////////////////////////////////////////////
	// OVERRIDDEN METHODS INHERITED FROM DECORATOR
	///////////////////////////////////////////////////////////////////////////
	@Override
	public void draw() {
		super.draw();
		this.scrollDraw(_scrollLength);
	}
	
	@Override
	public void resize() {
		super.resize();
		this.scrollResize(_scrollLength);
	}
	
	///////////////////////////////////////////////////////////////////////////
	// PRIVATE HELPER METHODS
	///////////////////////////////////////////////////////////////////////////
	private void scrollDraw(int scrollLength) {
		System.out.println("\nNow drawing scroll bar of length " + scrollLength + "\n");
	}
	
	private void scrollResize(int scrollLength) {
		System.out.println("\nNow resizing scroll bar of length" + scrollLength + "\n");
	}
}