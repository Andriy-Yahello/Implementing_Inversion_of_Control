package co.lofongi.third;
import org.springframework.beans.factory.annotation.Value;

public class ExStudent {
		@Value("John Sency")
		private String name;
		@Value("248")
		private String id;
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		@Override
		public String toString() {
			return "ExStudent [name=" + name + ", id=" + id + "]";
		}
		
}
