from unittest import TestCase

from fizzbuzz.FizzBuzz import FizzBuzz

class TestFizzBuzz(TestCase):
    def test_fizzbuzz_num(self):
        self.check_number_output(1,"1")

    def test_fizzbuzz_num_is_divisible_by_3(self):
        self.check_number_output(3, "fizz")

    def test_fizzbuzz_num_is_include_3(self):
        self.check_number_output(13, "fizz")

    def test_fizzbuzz_num_is_divisible_by_5(self):
        self.check_number_output(5, "buzz")

    def test_fizzbuzz_num_is_divisible_by_3_and_5(self):
        self.check_number_output(15, "fizzbuzz")

    def check_number_output(self,num,returnValue):
        self.assertEqual(str(FizzBuzz(num).fizzbuzz), returnValue)
