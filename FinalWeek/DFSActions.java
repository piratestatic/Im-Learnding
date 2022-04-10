public interface DFSActions<Vrtx> {
	public void processVertex(Vrtx vertex);

	public void descendVertex(Vrtx vertex);

	public void ascendVertex(Vrtx vertex);

	public void cycleDetected();
}