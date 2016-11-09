-- table name Hackers
-- hacker_id
-- name

-- table name Difficulty
-- difficulty_level
-- score

-- table name Challenges
-- challenge_id
-- hacker_id
-- difficulty_level

-- Submissions
-- submission_id
-- hacker_id
-- challenge_id
-- score

-- Write a query to print the respective hacker_id and name of hackers who achieved full scores for more than one challenge.
-- Order your output in descending order by the total number of challenges in which the hacker earned a full score.
-- If more than one hacker received full scores in same number of challenges, then sort them by ascending hacker_id.

select H.hacker_id , H.name
from Hackers as H,Difficulty as D,Challenges as C,Submissions as S
where S.hacker_id = H.hacker_id
and S.challenge_id = C.challenge_id
and C.difficulty_level = D.difficulty_level
and S.score = D.score
group by hacker_id
having count(H.hacker_id) > 1
order by count(H.hacker_id) desc,hacker_id
