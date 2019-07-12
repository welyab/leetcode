// https://leetcode.com/problems/defanging-an-ip-address/
class Defanging_an_IP_Address {
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}
