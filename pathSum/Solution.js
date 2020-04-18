// Lesson Learnt:  1. Mind javascript falsy values.  2. console.log could cause Output limit exceed

function TreeNode(val) {
    this.val = val;
    this.left = this.right = null;
 }

 var pathSum = function (root, sum) {
    if(root != null) return traverseChildren(root, sum, []) + pathSum(root.left, sum) + pathSum(root.right, sum)
    return 0
};

var traverseChildren = function(child, sum, trail) {
    if (child == null ) return 0
    var currentTrail = trail.concat(child.val)
    //console.log(currentTrail)
    return (child.val === sum) + traverseChildren(child.left, sum - child.val, currentTrail) + traverseChildren(child.right, sum - child.val, currentTrail)
}
