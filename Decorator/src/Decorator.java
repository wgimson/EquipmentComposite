
public class Decorator implements VisualComponent {
	
	private VisualComponent _component;
	
	public Decorator(VisualComponent component) {
		this._component = component;
	}
	
	///////////////////////////////////////////////////////////////////////////
	// Default implementations which pass the call on to the component; These 
	// are intended to be extended by subclasses
	///////////////////////////////////////////////////////////////////////////
	public void draw() {
		this._component.draw();
	}
	
	public void resize() {
		this._component.resize();
	}
}