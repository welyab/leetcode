// https://leetcode.com/problems/design-twitter/
class Twitter {

	private java.util.List<Tweet> posts;
	private java.util.Map<Integer, java.util.Set<Integer>> fallowers;

	private class Tweet {
		private int userId;
		private int tweetId;

		Tweet(int userId, int tweetId) {
			this.userId = userId;
			this.tweetId = tweetId;
		}
	}

	/** Initialize your data structure here. */
	public Twitter() {
		posts = new java.util.ArrayList<>();
		fallowers = new java.util.HashMap<>();
	}

	/** Compose a new tweet. */
	public void postTweet(int userId, int tweetId) {
		posts.add(new Tweet(userId, tweetId));
	}

	/**
	 * Retrieve the 10 most recent tweet ids in the user's news feed. Each item
	 * in the news feed must be posted by users who the user followed or by the
	 * user herself. Tweets must be ordered from most recent to least recent.
	 */
	public java.util.List<Integer> getNewsFeed(int userId) {
		java.util.Set<Integer> set = fallowers.get(userId);
		java.util.List<Integer> list = new java.util.ArrayList<>();
		for (int i = 0; i < posts.size(); i++) {
			Tweet e = posts.get(posts.size() - 1 - i);
			if (e.userId == userId || set != null && set.contains(e.userId)) {
				list.add(e.tweetId);
			}
			if (list.size() >= 10) {
				break;
			}
		}
		return list;
	}

	/**
	 * Follower follows a followee. If the operation is invalid, it should be a
	 * no-op.
	 */
	public void follow(int followerId, int followeeId) {
		if (!fallowers.containsKey(followerId)) {
			fallowers.put(followerId, new java.util.HashSet<>());
		}
		fallowers.get(followerId).add(followeeId);
	}

	/**
	 * Follower unfollows a followee. If the operation is invalid, it should be
	 * a no-op.
	 */
	public void unfollow(int followerId, int followeeId) {
		if (fallowers.containsKey(followerId)) {
			fallowers.remove(followerId).remove(followeeId);
		}
	}
}
