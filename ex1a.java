
String doggyMethod(int n) {
String result = doggyMethod(n-3) + n + doggyMethod(n-2);
if (n <= 0) {
return "";
}
return result;
}
