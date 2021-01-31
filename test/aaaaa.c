#include <stdio.h>
#include <stdbool.h>
int main() {
  int a = 10;
  int b = 2;
  bool c = true;
  return printf("%i\n",c? a+b : 42);
}