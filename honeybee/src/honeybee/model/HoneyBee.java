package honeybee.model;

public abstract class HoneyBee {
		
		protected String name;
		
		public String doYourJob() {
			return "I'm a HoneyBee!";
		}
		
		public String fly() {
			return "I believe, I can fly.";
		}
		
		protected HoneyBee(String name) {
			this.name = name;
		}
}

