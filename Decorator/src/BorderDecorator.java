
public class BorderDecorator extends Decorator {
	
	private int _borderWidth;
	
	public BorderDecorator(VisualComponent component, int borderWidth) {
		super(component);
		this._borderWidth = borderWidth;
	}
	
	///////////////////////////////////////////////////////////////////////////
	// OVERRIDDEN METHODS INHERITED FROM DECORATOR
	///////////////////////////////////////////////////////////////////////////
	@Override
	public void draw() {
		super.draw();
		this.drawBorder(_borderWidth);
	}
	
	@Override
	public void resize() {
		super.resize();
		this.borderResize(_borderWidth);
	}
	
	///////////////////////////////////////////////////////////////////////////
	// PRIVATE HELPER METHODS
	///////////////////////////////////////////////////////////////////////////
	private void drawBorder(int borderWidth) {
		System.out.println("\nBorder Decorator now drawing border " + borderWidth + " wide\n");
	}
	
	private void borderResize(int borderWidth) {
		System.out.println("\nNow resizing border of width" + borderWidth + "\n");
	}
}