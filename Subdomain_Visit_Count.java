import java.util.stream.Collectors;

// https://leetcode.com/problems/subdomain-visit-count/
public class Subdomain_Visit_Count {
	public java.util.List<String> subdomainVisits(String[] cpdomains) {
		java.util.HashMap<String, Integer> visits = new java.util.HashMap<>();
		for (String s : cpdomains) {
			int index = s.indexOf(" ");
			Integer count = Integer.parseInt(s.substring(0, index));
			String domain = s.substring(index + 1);
			String[] subdomains = domain.split("\\.");
			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < subdomains.length; i++) {
				String subdomain = subdomains[subdomains.length - 1 - i];
				if (i > 0) {
					builder.insert(0, ".");
				}
				builder.insert(0, subdomain);
				visits.put(builder.toString(), visits.getOrDefault(builder.toString(), 0) + count);
			}
		}
		return visits.entrySet()
			.stream()
			.map(e -> e.getValue() + " " + e.getKey())
			.collect(Collectors.toList());
	}
}
