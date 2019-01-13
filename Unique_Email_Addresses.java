// https://leetcode.com/problems/unique-email-addresses/
public class Unique_Email_Addresses {

    public int numUniqueEmails(String[] emails) {
        for(int i = 0; i< emails.length; i++) {
            int indexAt = emails[i].indexOf("@");
            String localFull = emails[i].substring(0, indexAt);
            int index = localFull.indexOf("+");
            String local = null;
            if(index >= 1) {
                local = localFull.substring(0, index);
            } else {
                local = localFull;
            }
            local = local.replaceAll("\\.", "");
            emails[i] = local + emails[i].substring(indexAt);
        }
        return new java.util.HashSet<>(java.util.Arrays.asList(emails)).size();
    }
}
