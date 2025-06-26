class Solution:
    def isCycle(self, V, edges):
        parent = [i for i in range(V)]
        rank = [0] * V

        def find(u):
            if parent[u] != u:
                parent[u] = find(parent[u])  
            return parent[u]

        def union(u, v):
            root_u = find(u)
            root_v = find(v)

            if root_u == root_v:
                return True 

            # Union by rank
            if rank[root_u] < rank[root_v]:
                parent[root_u] = root_v
            elif rank[root_u] > rank[root_v]:
                parent[root_v] = root_u
            else:
                parent[root_v] = root_u
                rank[root_u] += 1
            return False

        for u, v in edges:
            if union(u, v):
                return True 

        return False 
