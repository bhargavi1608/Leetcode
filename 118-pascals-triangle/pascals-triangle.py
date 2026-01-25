from math import factorial
from typing import List
class Solution:
    def generate(self,numRow:int):
        triangle=[]
        for n in range(numRow):
            rows=[]
            for r in range(n+1):
                nCr=factorial(n)//(factorial(r)*factorial(n-r))
                rows.append(nCr)
            triangle.append(rows)
        return triangle


