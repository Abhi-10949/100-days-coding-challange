const maxEvents = events => {
    // Sort events by end day
    events.sort((a, b) => a[1] - b[1]);

    // Find the latest end day
    const maxDay = events.at(-1)[1];

    // Initialize union-find (next available day)
    const nextDay = new Array(maxDay + 2).fill(0).map((_, i) => i);

    const search = day => {
        if (nextDay[day] !== day)
            nextDay[day] = search(nextDay[day]); // path compression
        return nextDay[day];
    };

    let count = 0;
    for (const [start, end] of events) {
        const day = search(start);
        if (day <= end) {
            count++;
            nextDay[day] = search(day + 1); // mark day as used
        }
    }
    return count;
};

function main() {
    const events = [
        [1, 2],
        [2, 3],
        [3, 4],
        [1, 2]
    ];

    const result = maxEvents(events);
    console.log("Maximum number of events that can be attended:", result);
}

main();