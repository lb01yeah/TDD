class FizzBuzz:
    def __init__(self,number):
        self.number = number

    @property
    def fizzbuzz(self):
        if self.isRelateNum(3) and self.isRelateNum(5):
            return "fizzbuzz"

        if self.isRelateNum(3):
            return "fizz"

        if self.isRelateNum(5):
            return "buzz"

        return self.number

    def isRelateNum(self,division):
        return self.number % division ==0 or str(self.number).find(str(division))>=0
