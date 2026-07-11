# Write your MySQL query statement below
SELECT user_id, count(prompt) AS prompt_count , round(avg(tokens),2) AS avg_tokens  FROM prompts
 GROUP BY user_id  
 HAVING count(prompt) >= 3 AND max(tokens)>avg(tokens)
  ORDER BY    avg_tokens DESC , user_id ASC ;