/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    let sum=init;
    for(let num of nums){
       sum=fn(sum,num);
    }
    return sum;
};