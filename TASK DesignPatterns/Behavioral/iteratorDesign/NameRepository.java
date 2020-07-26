public class NameRepository implements Container {
	public String Celeb_names[] = { "ShahRukh","Salman","Aamir"};
	
	@Override
	public Iterator getInterator() {
		return new NameIterator();
	}
	
	private class NameIterator implements Iterator {

		int index;
		@Override
		public boolean hasNext() {
			return index<Celeb_names.length;
		}

		@Override
		public Object next() {
			if(this.hasNext()) {
				return Celeb_names[index++];
			}
			return null;
		}
		
	}
}